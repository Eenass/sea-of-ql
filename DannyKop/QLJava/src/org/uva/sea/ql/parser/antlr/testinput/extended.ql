form box1 { 
	hasSoldHouse: "Did you sell a house in 2010?" boolean 
	hasBoudghtHouse: "Did you buy a house in 2010?" boolean 
	hasMaintLoan: "Did you enter a loan for maintenance/reconstruction?" boolean 
	if ( hasSoldHouse ) {
		sellingPrice: "Price the house was sold for:" money
		privateDebt: "Private debts for the sold house:" money
		valueResideu: "Value resideu:" money(sellingPrice - privateDebt)
		if( sellingPrice ) {
			hasFraude: "Have u been ..." boolean
			// Dit commentaar is zo ontzettend nuttig!!
			if( hasFraude ) {
				hasNog: "een vraag" boolean
			}
		}
		/**
		 * Hier staat een heel verhaal.
		 * Over meerdere lijnen! :-)
		 */
	} 
}