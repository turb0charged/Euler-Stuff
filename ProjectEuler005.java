//Smallest number evenly divisible by 1-20
public class ProjectEuler005{
    public static void main (String[] args){
	int x=20;
	for(int i=19;i<x;i++){
	    if(x%1==0)
		if(x%2==0)
		    if(x%3==0)
			if(x%4==0)
			    if(x%5==0)
				if(x%6==0)
				    if(x%7==0)
					if(x%8==0)
					    if(x%9==0)
						if(x%10==0)
						    if(x%11==0)
							if(x%12==0)
							    if(x%13==0)
								if(x%14==0)
								    if(x%15==0)
									if(x%16==0)
									    if(x%17==0)
										if(x%18==0)
										    if(x%19==0)
											if(x%20==0){
											System.out.println(x+" is the smallest number evenly divisible by 1-20");}
											else{
											    x++;}
										    else{
											x++;}
										else{
										    x++;}
									    else{
										x++;}
									else{
									    x++;}
								    else{
									x++;}
								else{
								    x++;}
							    else{
								x++;}
							else{
							    x++;}
						    else{
							x++;}
						else{
						    x++;}
					    else{
						x++;}
					else{
					    x++;}
				    else{
					x++;}
				else{
				    x++;}
			    else{
				x++;}
			else{
			    x++;}
		    else{
			x++;}
		else{
		    x++;}
	    else{
		x++;}
	}
    }
}
