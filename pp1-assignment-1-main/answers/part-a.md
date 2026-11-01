# Del A: Regler för ett resekort

## Regler som borde gälla

1. Saldot får inte överstiga maxbelopp. 
2. man ska få betala om saldot är positiv 
3. saldot får inte bli negativt 

## Varför skyddar inte dataclassen mot felen?

Dataclassen skyddar inte mot felen för att en 
dataclass är public attribute. det finns ingen 
metod som skyddar och kontrollerar att reglerna 
följs. ädnringen på number och balance som är 
publika attribute får inte nekas. 
dataclassens uppgift är att samla data och kan inte
skydda datan. Alltså den är öppen för direkt åtkomst 
och det saknar metoder för att kontrollera fältet. 

