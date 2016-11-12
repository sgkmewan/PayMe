#include <RFID.h>

/*
* Read a card using a mfrc522 reader on your SPI interface
* Pin layout should be as follows (on Arduino Uno):
* MOSI: Pin 11 / ICSP-4
* MISO: Pin 12 / ICSP-1
* SCK: Pin 13 / ISCP-3
* SS/SDA: Pin 10
* RST: Pin 9
*/

#include <SPI.h>
#include <RFID.h>

#define SS_PIN 10
#define RST_PIN 9

RFID rfid(SS_PIN,RST_PIN);

String card_Val;
String card_Val1 = "null";

int power = 8; 
int serNum[5];




void setup(){

    Serial.begin(9600);
    SPI.begin();
    rfid.init();

   
}

void loop(){
    
    if(rfid.isCard()){
    
        if(rfid.readCardSerial()){
  
            String a = String(rfid.serNum[0]);
            String b = String(rfid.serNum[1]);
            String c = String(rfid.serNum[2]);
            String d = String(rfid.serNum[3]);
            String e = String(rfid.serNum[4]);

            card_Val = a + b + c + d + e;

            if(card_Val != card_Val1){
                card_Val1 = card_Val;
                Serial.println(card_Val1);
                delay(2000);
              }
            
        }
        
    }
    
    
    
    rfid.halt();

}


