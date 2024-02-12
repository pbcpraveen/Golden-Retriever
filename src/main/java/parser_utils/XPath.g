/* This file contains the grammar description for the ANTLR to read and generate objects*/

/* ap → doc(fileName)/rp | doc(fileName)//rp */
/* rp → tagName | ∗ | . | .. | text() | @attName | (rp) | rp1/rp2 | rp1//rp2 | rp[f] | rp1, rp2 */
/* f → rp | rp1 = rp2 | rp1 eq rp2 | rp1 == rp2 | rp1 is rp2 | rp = StringConstant | (f) | f1 and f2 | f1 or f2 | not f */
/* tagName → StringConstant */
/* attName → StringConstant */
/* fileName → StringConstant */

grammar XPath;

eval
    : absolutePath
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
PathTag: ~(' ' | '\t' | '\r' | '\n' | '/' | '*' | '.' | '(' | ')' | '[' | ']' | ',' | '@' | '"' | '\'' )+;

/* Ignore all white spaces */
WS : (' ' | '\t' | '\r' | '\n') -> skip;
