package OO_RestMenu;

public class Bill {
	
double CostOfChic_FR=110;
double CostOfChic_Soup=90;
double CostOfVeg_Rice=100;
double CostOfPaneer_Fried=130;
double CostOfMS=60;
double CostOfCoca=40;
double CostOfFrooti=45;
double CostOfMeal;
double CostOfDrinks;
double SubTotal;
double Tax;
double Total;
int QuantityOfChic_FR;
int QuantityOfChic_Soup;
int QuantityOfVeg_Rice;
int QuantityOfPaneer_Fried;
int QuantityOfMS;
int QuantityOfCoca;
int QuantityOfFrooti;
double getSubTotal()
{
	CostOfMeal = CostOfChic_FR* QuantityOfChic_FR+CostOfChic_Soup* QuantityOfChic_Soup+CostOfVeg_Rice* QuantityOfVeg_Rice+CostOfPaneer_Fried* QuantityOfPaneer_Fried;
	CostOfDrinks= CostOfMS* QuantityOfMS+CostOfCoca* QuantityOfCoca+CostOfFrooti* QuantityOfFrooti;
	SubTotal = CostOfMeal+CostOfDrinks;
	return SubTotal;
}

double getTotal()
{
	Tax = SubTotal*0.1;
	Total = SubTotal+Tax;
	return Total;
}
}
