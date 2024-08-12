def Normal(a:Double)= 250 * a
def OT(b:Double)= 85 * b
def Tax(a:Double , b:Double)= (Normal(a) + OT(b)) * 0.12

def TakeHome(a:Double , b:Double) = Normal(a) + OT(b) - Tax(a,b) 