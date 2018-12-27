
public class HelloWorld {
	public static void main(String[] args) {

		String text = "Engineering the Future - с 1758 года: являясь лидером в области автотранспорта и энергомашиностроения, компания MAN предлагает множество продуктов, услуг и системных решений в этой сфере.";
		int before = text.length();
		int after = text.replaceAll("[,.:-]", "").length();
		System.out.println("Количество знаков препинания в тексте: " + (before - after));
	}
}
