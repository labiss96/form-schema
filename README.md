### Form Schema
> 임의의 폼 정의를 위한 스키마 BNF 정의, Parser, Ast, Interpreter 구현

* FormSchemaParser
  * `javacc-7.0.12`
  ```
  # 1. install javacc (ver 7.0.12)
  # 2. set environment variable (<javacc-dir>/script/)
  # 3. run command
  javacc FormSchemaParser.jj 
  ```
  
* Form Schema BNF
```
Schema := Form
Form := ( Field ";" )+
Field := <IDENT> ":" Type [ "{" Option ( "," Option )* "}" ] [ Enums | EnumsRef ]
Type := "string" | "number" | "boolean"
Option := <IDENT> "=" <STRING>
Enums := "[" Enum ( "," Enum )* "]"
Enum := StringEnum | NumberEnum | BooleanEnum
StringEnum := <STRING> [ ":" <STRING> ] [ ( "{" Form "}" ) | FormRef ]
NumberEnum := <NUMBER> [ ":" <STRING> ] [ ( "{" Form "}" ) | FormRef ]
BooleanEnum := <BOOLEAN> [ ( "{" Form "}" ) | FormRef ]
EnumsRef := "#" <IDENT>
FormRef := "$" <IDENT>
```