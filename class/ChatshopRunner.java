class ChatshopRunner{
	public static void main(String[] name){
		//System.out.println("main method started");
		boolean isChatAdded = ChatShop.createChatName("Bhelpuri");
		System.out.println("is chat created: " +isChatAdded);
		boolean ischatPriceAdded = ChatShop.addChatPrice(35.00);
		System.out.println("and the chat price is :"+ischatPriceAdded);
		//ChatShop.getChatPrice();
		ChatShop.createChatName("Masala Puri");
		ChatShop.createChatName("dahi puri");
		ChatShop.createChatName("sev puri");
		ChatShop.createChatName("pani puri");
		ChatShop.createChatName("gol gappa");
		ChatShop.createChatName("sukka gappa");
		//ChatShop.getChats();
		boolean isChatUpdated=ChatShop.upadateChatName("sev puri","masala mix");
		System.out.println(isChatUpdated);
				ChatShop.getChats();
		boolean isDeleted=ChatShop.deleteChatName("gol gappa");
		System.out.println("is chat deleted: " +isDeleted);
		ChatShop.getChats();
		isDeleted=ChatShop.deleteChatName("nippat masala");
		ChatShop.getChats();


		//System.out.println("main method ended");

}
}