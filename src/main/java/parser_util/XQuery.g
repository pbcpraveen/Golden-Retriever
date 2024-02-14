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
    : xquery
    ;

xquery
    : variable
    | stringConstant
    | absolutePath
    | xqueryInParenthesis
    | xquery Comma xquery
    | xquery ImmediateDescendent relativePath
    | xquery Descendent relativePath
    | newTag
    | forBody
    | letClause
    ;

stringConstant
    : stringConstantText
    ;

variable
    : Variable
    ;

xqueryInParenthesis
    : OpenParen xquery CloseParen
    ;

newTag
    : OpenTag OpenBrace xquery CloseBrace  CloseTag
    ;

forBody
    : forClause letClause whereClause returnClause
    ;

forClause
    : For forVariables In xquery
    ;

forVariables
    : loopVariableAssignment
    | loopVariableAssignment Comma forVariables
    ;

loopVariableAssignment
    : variable In xquery
    ;

letClause
    : (Let letVariables)?
    ;

letVariables
    : letVariableAssignment
    | letVariableAssignment Comma letVariables
    ;

letVariableAssignment
    : variable Assign xquery
    ;

whereClause
    : (Where cond)?
    ;

cond
    : emptyCond
    | equalityCond
    | identicalCond
    | someVarCond
    | parenthesisCond
    | cond And cond
    | cond Or cond
    | notCond
    ;

emptyCond
    : Empty OpenParen xquery CloseParen
    ;

equalityCond
    : xquery Equal xquery
    | xquery Eq xquery
    ;

identicalCond
    : xquery Equals xquery
    | xquery Is xquery
    ;

someVarCond
    : Some forVariables In xquery
    ;

parenthesisCond
    : OpenParen cond CloseParen
    ;

notCond
    : Not cond
    ;

returnClause
    : Return xquery
    ;

absolutePath
    : DocOpen fileName CloseParen ImmediateDescendent relativePath
    | DocOpen fileName CloseParen Descendent relativePath
    ;

relativePath
    : tagName
    | children
    | current
    | parent
    | textFunction
    | attribute
    | inParenthesis
    | relativePath ImmediateDescendent relativePath
    | relativePath Descendent relativePath
    | relativePath filter
    | relativePath Comma relativePath
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
    : OpenBracket f CloseBracket
    ;

attribute
    : At attName
    ;

textFunction
    : Text OpenParen CloseParen
    ;

inParenthesis
    : OpenParen relativePath CloseParen
    ;


f
    : relativePath
    | relativePath Equal relativePath
    | relativePath Eq relativePath
    | relativePath Equals relativePath
    | relativePath Is relativePath
    | relativePath Equal stringConstantText
    | OpenParen f CloseParen
    | f And f
    | f Or f
    | Not f
    ;

tagName
    : PathTag
    ;

attName
    : StringConstant
    ;

fileName
    : StringConstant
    ;

stringConstantText
    : StringConstant
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
StringConstant: ('"' ~('\''|'"')* '"') | ('\'' ~('\''|'"')* '\'');
PathTag: ('A' .. 'Z')+;
Variable: ('a' .. 'z' | '0' .. '9' )+;
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
OpenTag: '<' ('A' .. 'Z')+ '>';
CloseTag: '</' ('A' .. 'Z')+ '>';

/* Ignore all white spaces */
WS : (' ' | '\t' | '\r' | '\n') -> skip;
