package analexico;
import static analexico.Token.*;
%% 
%class Lexer
%type Token
L=[a-b]
D=[0-9]

white=[ ,\n]
%{
	public String lexeme;
%}
%%
{white} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return igual;}
"+" {return suma;}
{L} {lexeme=yytext(); return Variable;}
{D} {lexeme=yytext(); return Numero;}
"*" {return multiplicacion;}
"-" {return resta;}
"/" {return division;}
.   {return ERROR;}
