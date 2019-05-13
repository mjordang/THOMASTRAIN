# THOMASTRAIN
Trains tracking


Execution steps

1. - Open home/THOMASTRAIN/EXECUTION folder and copy the  files thomas_train-0.0.1-SNAPSHOT.jar and run_thomas_the_train.bat in a local folder in your computer

2. - Editing the bat file it is possible to see the execution command java -Dorg.apache.cxf.Logger=org.apache.cxf.common.logging.Slf4jLogger -jar thomas_train-0.0.1-SNAPSHOT.jar A-E-D with the selected route to calculate as a 	parameter, in order to run the test with several rutes change accordingly the route.

3. - Execute the bat file

4. - In the console opened will appear the result of the execution with messages informing about the calculation of route distance:
		=============== The distance of your route is:#number =============== or
		========================= NO SUCH ROUTE. Please use the most direct route and do not make any extra stops  =========================

    in addition to other message about the steps in the process execution.
	
	
Assumptions
- Only 5 cities (A,B,C,D,E) have trains station and not more
- The availabe routes are only the named in the statement of the exercise:AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
- The user has to indicate the complete route(including all cities) using "-" character between towns, if not an error is reported in the process
