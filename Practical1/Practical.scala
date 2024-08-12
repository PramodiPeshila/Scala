
def Area(x:Double)=Math.PI*x*x

def fahrenheit(c:Double)=c*1.8000+32.00

def volume(r:Double)=Math.PI*4/3*r*r*r

def Price(x:Int)=x*24.95*0.6
def shipping(x:Int)={
	if(x>50){
		3+(x-50)*0.75
	}
	else{
		3
	}
}
				
def easy(x:Int):Int=x*8
def tempo(x:Int):Int=x*7


