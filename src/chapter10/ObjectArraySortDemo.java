package chapter10;
/**
 * �������������ʾ��
 * @author sunguangyu
 *
 */
public class ObjectArraySortDemo {
	
	public static void sort(Hero[] heroArray){
		Hero tempHero = null;		//����������Ӣ�۶���
		for (int i = 0; i < heroArray.length; i++) {
			for (int j = 0; j < heroArray.length - i -1; j++) {
				if(heroArray[j].compareToByName(heroArray[j + 1]) > 0){
					tempHero = heroArray[j];
					heroArray[j] =heroArray[j + 1];
					heroArray[j + 1] = tempHero;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Warrior սʿ1 = new Warrior();
		Warrior սʿ2 = new Warrior();
		Warrior սʿ3 = new Warrior();
		Warrior սʿ4 = new Warrior();
		Warrior սʿ5 = new Warrior();
		Archmage ��ʦ1 = new Archmage();
		Archmage ��ʦ2 = new Archmage();
		Archmage ��ʦ3 = new Archmage();
		Archmage ��ʦ4 = new Archmage();
		Archmage ��ʦ5 = new Archmage();
		
		Hero[] heroArray = {
				սʿ1, սʿ2, սʿ3, սʿ4, սʿ5,
				��ʦ1, ��ʦ2, ��ʦ3, ��ʦ4, ��ʦ5,
		};
		System.out.println("����ǰ");
		System.out.println("����\t�ǳ�\tmaxLife\tlife\t������");
		
		for(Hero hero : heroArray){
			System.out.println(hero);
		}
		
		sort(heroArray);
		
		System.out.println("�����");
		System.out.println("����\t�ǳ�\tmaxLife\tlife\t������");
		for(Hero hero : heroArray){
			System.out.println(hero);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
