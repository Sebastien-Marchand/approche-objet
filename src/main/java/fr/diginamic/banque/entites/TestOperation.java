package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Operation monTabDoperation[] = new Operation[4];
		float totalOperation = 0f;
		
			monTabDoperation[0] = new Debit("04/03/2020"+"15H"+(30), 150);
			monTabDoperation[1] = new Credit("04/03/2020"+"15H"+(45), 1500);
			monTabDoperation[2] = new Debit("04/03/2020"+"15H"+(50), 350);
			monTabDoperation[3] = new Credit("04/03/2020"+"15H"+(51), 200);
			
			System.out.println("\tSans Méthode abstract:\n");
																						//affiche le montant et le type d'opération

		for(int i = 0 ; i < 4 ; i++)
		{
			System.out.print("L'operation "+ monTabDoperation[i].getClass().getSimpleName() + " ");
			
			System.out.println(i+" à la date du :"+monTabDoperation[i].maDateDoperation + " d'un montant de : "+ monTabDoperation[i].montantDeLoperation);
		}
		System.out.println("\tMéthode abstract:\n");
																			//affiche le montant et le type d'opération
		for(int i = 0 ; i < 4 ; i++)
		{
			System.out.print("L'operation "+ monTabDoperation[i].afficherType());
			
			System.out.println(i+" à la date du :"+monTabDoperation[i].maDateDoperation + " d'un montant de : "+ monTabDoperation[i].montantDeLoperation);
		}
		
																		//affiche les montant des opérations, affiche le total des opérations
		for(int i = 0 ; i < 4 ; i++)
		{
			if("Crédit" == monTabDoperation[i].afficherType() )
			{
				System.out.print(totalOperation+ " + "+ monTabDoperation[i].montantDeLoperation);
				
				totalOperation = totalOperation + monTabDoperation[i].montantDeLoperation;
				
				System.out.println(" = "+ totalOperation);
			}
			else if (monTabDoperation[i].afficherType() =="Débit")
			{
				System.out.print(totalOperation+ " - "+ monTabDoperation[i].montantDeLoperation);

				totalOperation = totalOperation - monTabDoperation[i].montantDeLoperation;
				
				System.out.println(" = "+ totalOperation);

			}
		}
		System.out.println("total des operation :" + totalOperation);
		
	}

}
