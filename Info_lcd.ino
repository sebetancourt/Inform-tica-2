#include <LiquidCrystal.h>
LiquidCrystal lcd(11,12,10,9,8,7);
int dato;
int letra;
int fila;
void setup() {
Serial.begin(9600);
  // set up the LCD's number of columns and rows:
  lcd.begin(16, 2);
  // Print a message to the LCD.
  lcd.print("hello, world!");
  letra=0;
  fila=0;
}

void loop() {
 
  if(Serial.available())
  {
    dato=Serial.read();
    lcd.setCursor(letra, fila);
    if(letra==16)
    {
      fila=1;
    }
    lcd.write(dato);
    letra++;
  }
}
