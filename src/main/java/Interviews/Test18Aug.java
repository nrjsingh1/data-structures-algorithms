package Interviews;

public class Test18Aug {
    public static void main(String[] args) {

        /*
        #1 Design Basic Traffic Signal - only 3 lights , 1 road , no crossroad, zebraCrossing
class diagram
	class methods
	SOLID principle if any
	Basic Design Patterns
	Use case
        zebraCrossing




zebraCrossing:
    Vehicles - stops / start - on the basis signal
    People - walk/stop - on the basis of signal
    Signal - green/red/yellow  -  yellow - any change in signal is happening

    Design Pattern - State Design Pattern

    Class - Signal
                Light
                Method - changeSignal(currentState, <States -- Not required >,  time)
                                currentState = RED - wait for TIME - change to GREEN
                                currentState = GREEN - wait for TIME - change to YELLOW
                                currentState = YELLOW - wait for TIME - change to RED

                                return - curentState

                Method - getCurrentSignal - Light


    Class - State
                Field - curentState - RED/GREEN/YELLOW/
                Method -changeState(){
                    changeSignal()
                }


    Class - TIME
               F -time
               M -getTime
               M- setTime



    Class- Main
            while(true){
                changeState(TIME){
                    currentSignal()
                }
            }




#2``````
        * */

    }
}
