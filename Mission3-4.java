
public class HelloWorld {
	 public static void main(String[] args) {
	        String str = " Engineering the Future - с 1758 года: являясь лидером в области автотранспорта и энергомашиностроения, компания MAN предлагает множество продуктов, услуг и системных решений в этой сфере.";
	        str = str.trim();
	        String[] words = str.split("[\\s,.:!?-]+");
	        System.out.println("Слов: " + words.length);
	    }
	 
	}