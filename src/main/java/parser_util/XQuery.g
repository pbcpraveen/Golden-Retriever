/* This file contains the grammar description for the ANTLR to read and generate objects*/

/* ap → doc(fileName)/rp | doc(fileName)//rp */
/* rp → tagName | ∗ | . | .. | text() | @attName | (rp) | rp1/rp2 | rp1//rp2 | rp[f] | rp1, rp2 */
/* f → rp | rp1 = rp2 | rp1 eq rp2 | rp1 == rp2 | rp1 is rp2 | rp = StringConstant | (f) | f1 and f2 | f1 or f2 | not f */
/* tagName → StringConstant */
/* attName → StringConstant */
/* fileName → StringConstant */
/* X Q → V ar | StringConstant | ap */
/*   | (XQ1) | XQ1, XQ2 | XQ1/rp| XQ1//rp  */
/*   | ⟨tagName⟩{X Q1 }⟨/tagName⟩  */
/*   | forClause letClause whereClause returnClause | letClause X Q1 */


grammar XQuery;

eval
    : Separators* xq Separators* EOF
    ;

xq
    : stringConstant
    | xqInParenthesis
    | newTag
    | forBody
    | letClauseAndXq
    | absolutePath
    | joinBody
    | xq Separators* Comma Separators* xq
    | xq Separators* ImmediateDescendent Separators* relativePath
    | xq Separators* Descendent Separators* relativePath
    | variable
    ;

stringConstant
    : stringConstantText
    ;


xqInParenthesis
    : OpenParen Separators* xq Separators* CloseParen
    ;

newTag
    : openTag Separators* OpenBrace Separators* xq Separators* CloseBrace Separators*  closeTag
    ;

forBody
    : forClause Separators* letClause? Separators* whereClause?  Separators* returnClause
    ;

forClause
    : For Separators* forVariables
    ;

forVariables
    : loopVariableAssignment Separators* moreLoopVariables
    | loopVariableAssignment
    ;

moreLoopVariables
    : Comma Separators* forVariables
    ;

loopVariableAssignment
    : variable Separators* In Separators* xq
    ;

letClauseAndXq
    : letClause Separators* xq
    ;

letClause
    : Let Separators* letVariables
    ;

letVariables
    : letVariableAssignment Separators* moreLetVariables
    | letVariableAssignment
    ;

moreLetVariables
    : Comma Separators* letVariables
    ;

letVariableAssignment
    : variable Separators* Assign Separators* xq
    ;

whereClause
    : Where Separators* cond
    ;

cond
    : emptyCond
    | equalityCond
    | identicalCond
    | someVarCond
    | parenthesisCond
    | cond Separators* And Separators* cond
    | cond Separators* Or Separators* cond
    | notCond
    ;

emptyCond
    : Empty Separators* OpenParen Separators* xq  Separators* CloseParen
    ;

equalityCond
    : xq Separators* Equal  Separators* xq
    | xq Separators* Eq  Separators* xq
    ;

identicalCond
    : xq Separators* Equals  Separators* xq
    | xq Separators* Is Separators* xq
    ;

someVarCond
    : Some Separators* forVariables Separators* Satisfies Separators* cond
    ;

parenthesisCond
    : OpenParen Separators* cond Separators* CloseParen
    ;

notCond
    : Not Separators* cond
    ;

returnClause
    : Return Separators* xq
    ;

joinBody
    : Join Separators* OpenParen Separators* xq Separators* Comma Separators* xq Separators* Comma Separators*  joinCond Separators*  Comma Separators* joinCond Separators* CloseParen
    ;

joinCond
    : OpenBracket Separators* multipleTags* Separators* CloseBracket
    ;

multipleTags
    : tagName Separators* Comma Separators* multipleTags
    | tagName
    ;

absolutePath
    : DocOpen Separators* fileName Separators* CloseParen Separators* ImmediateDescendent Separators* relativePath
    | DocOpen Separators* fileName Separators* CloseParen Separators* Descendent Separators* relativePath
    ;

relativePath
    : tagName
    | children
    | current
    | parent
    | textFunction
    | attribute
    | inParenthesis
    | relativePath Separators* ImmediateDescendent Separators* relativePath
    | relativePath Separators* Descendent Separators* relativePath
    | relativePath Separators* filter
    | relativePath Separators* Comma Separators* relativePath
    ;

children
    : Children
    ;

current
    : Current
    ;

parent
    : Parent
    ;

filter
    : OpenBracket Separators* f Separators* CloseBracket
    ;

attribute
    : At attName
    ;

textFunction
    : Text OpenParen CloseParen
    ;

inParenthesis
    : OpenParen Separators* relativePath Separators* CloseParen
    ;


f
    : relativePath
    | relativePath Separators* Equal Separators* relativePath
    | relativePath Separators* Eq Separators* relativePath
    | relativePath Separators* Equals Separators* relativePath
    | relativePath Separators* Is Separators* relativePath
    | relativePath Separators* Equal Separators* stringConstantText
    | OpenParen f CloseParen
    | f Separators* And Separators* f
    | f Separators* Or Separators* f
    | Not Separators* f
    ;

tagName
    : PathTag
    ;

attName
    : StringConstant
    ;

fileName
    : FileName
    ;

stringConstantText
    : StringConstant
    ;

variable
    : Variable
    ;
openTag
    : OpenAngular PathTag CloseAngular
    ;

closeTag
    : OpenAngularwithforwardslash PathTag CloseAngular
    ;
DocOpen: 'doc(' ;
ImmediateDescendent: '/';
Descendent: '//';
Equal: '=';
Equals: '==';
Is: 'is';
Eq: 'eq';
And: 'and';
Or: 'or';
Not: 'not';
Comma: ',';
OpenBracket: '[';
CloseBracket: ']';
OpenParen: '(';
CloseParen: ')';
At: '@';
Text: 'text';
Children: '*';
Current: '.';
Parent: '..';
FileName: '"' ('A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | ' ' | '-')+ '.' ('x' 'm' 'l') '"';
StringConstant: ('"' ~('\''|'"')* '"') | ('\'' ~('\''|'"')* '\'');
Dollar: '$';
For: 'for';
Let: 'let';
Some: 'some';
Empty: 'empty';
In: 'in';
Where: 'where';
OpenBrace: '{';
CloseBrace: '}';
Assign: ':=';
Return: 'return';
Satisfies: 'satisfies';
CloseAngular: '>';
OpenAngular: '<';
OpenAngularwithforwardslash: '<' '/';
Join: 'join';
PathTag: ('A' .. 'Z' | 'a' .. 'z' | '0' .. '9')+;
Variable: '$' ('a' .. 'z'| '0' .. '9')+;
Separators : (' ' | '\t' | '\r' | '\n') ;


