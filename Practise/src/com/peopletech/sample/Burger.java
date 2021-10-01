package com.peopletech.sample;

public class Burger {

private BurgerStatus status=BurgerStatus.READY;
public enum BurgerStatus{
ORDERED,
PREPARING,
READY,
DELIVERED;
}
public boolean isDeliverable() {
if(getStatus().equals(Burger.BurgerStatus.READY))
return true;
else
return false;
}
public int  getDeliveryTimeInMin() {
int r=0;
switch(status)
{
case ORDERED : r=12;break;
case PREPARING:r=16;break;
case READY:r=2;break;
case DELIVERED:r=0;break;
default:System.out.println("Burger is not odered yet");
} return r;
}
public BurgerStatus getStatus() {
return status;
}
public void setStatus(BurgerStatus status) {
this.status=status;
}
}