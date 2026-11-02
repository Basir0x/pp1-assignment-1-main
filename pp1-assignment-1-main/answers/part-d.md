# Del D: Reflektion

1. Saldot kan inte bli negativ det skyddas av fältet balance som är private
ingen kan ändra det. pay(amount) har en if amount > balance som returnerar false
utan att ändra något om saldot är inte tillräckligt. 
det inte går att lada eller betala med negativa belopp. 
kortnummer kan inte ändras pgv att fältet nummer är privat och final. 
det finns en gräns som man kan inte ladda mer än 200 euro. detta skyddas av
topUp(amount) som kollar if (balance + amount > Max_Balance). 

2. om man skulle la till en setter skulle alla skydd för saldot brytas.
Då kunde vem som heslt skriva till exampel "kort1.setBalance("-1000")
eller kort1.setBalance(60000000000). inkapsulen skulle vara bruten eftersom 
klasen inte längre följer reglerna. 

3. 


## Tidsåtgång (fråga 5)

| Del | Timmar |
|-----|--------|
| A   | Cirka 30       |
| B   |   cirka 2 timmar       |
| C   |  cirka 5 timmar       |
| D   |  cirka 1 timme  |
