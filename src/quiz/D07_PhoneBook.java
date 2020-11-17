package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D07_PhoneBook {

	// # HashMap�� �̿��� Phone Book�� �����غ�����

	// 1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ� �Ѵ�
	// 2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
	// 3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű�� ������ �̸��� ���´�

	// # �����ؾ� �� �޼���

	// 1. ���ο� �׷��� �߰��ϴ� �޼���
	// 2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	// 3. ��ϵ� ��� ��ȭ��ȣ�� ���� ���� ����ϴ� �޼���
	// 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	// 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���

	HashMap<String, HashMap<String, String>> phonebook_map;

	public D07_PhoneBook() {
		phonebook_map = new HashMap<>();
	}

	/* �׷� �߰� ������ true�� ��ȯ */
	public boolean addGroup(String groupName) {
		if (phonebook_map.containsKey(groupName)) {
			System.err.println("�̹� �����ϴ� �׷���Դϴ�.");
			return false;
		} else {
			phonebook_map.put(groupName, new HashMap<>());
			System.out.print("���ο� �׷��� �߰��Ǿ����ϴ�. [" + groupName + "]");
			return true;
		}
	}

	/* ��ȭ��ȣ ��� ������ true */
	public boolean addPhoneNumber(String groupName, String tel, String name) {

		if (!phonebook_map.containsKey(groupName)) {
			System.err.print("�������� �ʴ� �׷���Դϴ�. [" + groupName + "]");
			return false;
		}

		HashMap<String, String> group = phonebook_map.get(groupName);

		if (group.containsKey(tel)) {
			System.out.println("�ش� ������ �����Ǿ����ϴ�");
		} else {
			System.out.println("���ο� ��ȣ���� �߰��߽��ϴ�.");
		}

		phonebook_map.get(groupName).put(tel, name);
		return true;
	}

	private boolean str_contains(String check, String frag) {
		// chk : ��ü ���ڿ�
		// fr : �κ� ���ڿ�

		// �κ� ���ڿ��� �� �ձ��ڰ� chk�� �ִ��� ���� �˻�
		// ã���� �ش� �κк��� ��� fr�� ��ġ�ϸ� true
		char[] chk = check.toCharArray();
		char[] fr = frag.toCharArray();

		char ch1 = fr[0];

		for (int i = 0; i < chk.length; ++i) {

			if (chk[i] == ch1 && (chk.length - i) >= fr.length) {
				int cnt = 0;
				for (int j = 0; j < fr.length; ++j) {
					if (chk[i + j] == fr[j]) {
						++cnt;
					} else {
						break;
					}
				}

				if (cnt == fr.length) {
					return true;
				}
			}
		}

		return false;

//		return check.contains(frag);
	}

	/* �̸����� �˻��ϸ� �ش��ϴ� entry���� set���·� ��ȯ�Ǵ� �޼��� */
	public Set<List<String>> seachByName(String name_frag) {

		Set<List<String>> to_return = new HashSet<>();

		// K V
		// HashMap<String, HashMap<String, String>> phonebook_map

		// ��ȭ��ȣ �̸�
		for (HashMap<String, String> groupMap : phonebook_map.values()) {

			for (String phoneNumber : groupMap.keySet()) {

				String name = groupMap.get(phoneNumber);

				if (str_contains(name, name_frag)) {
					// ã�� ����� ������ ����Ʈ�� �籸���Ͽ� ����
					// index 0���� ��ȣ ����, 1���� ��ȣ ����
					List<String> found = new ArrayList<>();
					found.add(name);
					found.add(phoneNumber);

					to_return.add(found);
				}
			}
		}

		return to_return;
	}

	/* ��ȣ�� �˻��ϸ� �ش��ϴ� entry���� Set���·� ��ȯ�Ǵ� �޼��� */
	public Set<List<String>> seachByPhoneNumber(String phone_frag) {
		Set<List<String>> to_return = new HashSet<>();

		for (HashMap<String, String> groupMap : phonebook_map.values()) {

			for (String phoneNumber : groupMap.keySet()) {
				if (str_contains(phoneNumber, phone_frag)) {

					List<String> found = new ArrayList<>();
					found.add(groupMap.get(phoneNumber));
					found.add(phoneNumber);

					to_return.add(found);
				}
			}
		}

		return to_return;
	}

	public static void main(String[] args) {

		D07_PhoneBook phonebook_a = new D07_PhoneBook();

		phonebook_a.addGroup("�б�");
		phonebook_a.addPhoneNumber("�б�", "010-1234-1234", "��浿");
		phonebook_a.addPhoneNumber("�б�", "010-1234-1234", "ȫ�浿");
		phonebook_a.addPhoneNumber("�б�", "010-1234-1111", "�ڱ浿");
		phonebook_a.addPhoneNumber("�б�", "010-1234-2222", "�ӱ浿");
		phonebook_a.addPhoneNumber("�б�", "010-1234-3333", "�ֱ浿");

		System.out.println(phonebook_a.phonebook_map);

		System.out.println(phonebook_a.seachByName("��"));
		System.out.println(phonebook_a.seachByPhoneNumber("22"));

//		HashMap<String, HashMap<String, String>> phone_book = new HashMap<>();
//
//		phone_book.put("����", new HashMap<>());
//		phone_book.put("ģ��", new HashMap<>());
//
//		HashMap<String, String> fam_map = phone_book.get("����");
//		fam_map.put("010-1111-1111", "�ƹ���");
//		fam_map.put("010-2222-2222", "��Ӵ�");
//		fam_map.put("010-3333-3333", "�ҸӴ�");
//
//		HashMap<String, String> fri_map = phone_book.get("ģ��");
//		fri_map.put("010-9999-9999", "�����");
//		fri_map.put("010-8888-8888", "��ҷ�");
//		fri_map.put("010-7777-7777", "������");
//
//		System.out.println(phone_book);
//		System.out.println(fri_map);
//		System.out.println(fri_map.get("010-9999-9999"));

	}

}

// ���ο� �׷��� �߰��ϴ� �޼���

//		HashMap<String, HashMap<String, HashMap<String, String>>> phone_book = new HashMap<>();
//		
//		phone_book.put("����", new HashMap<>());
//		phone_book.put("ģ��", new HashMap<>());
//		
//		HashMap<String, HashMap<String, String>> fam_map = phone_book.get("����");
//		
//		fam_map.put("010-1111-1111", new HashMap<>());
//		fam_map.put("010-2222-2222", new HashMap<>());
//		fam_map.put("010-3333-3333", new HashMap<>());
//		
//		HashMap<String, String> fam_map2 = fam_map.get("");
//		fam_map2.put("�ƹ���", "����");
//		fam_map2.put("010-2222-2222", "������");
//		fam_map2.put("010-3333-3333", "���̹�");
//		
//		HashMap<String, HashMap<String, String>> frend_map = phone_book.get("ģ��");
//		
//		frend_map.put("010-9999-9999", new HashMap<>());
//		frend_map.put("010-9999-9999", new HashMap<>());
//		frend_map.put("010-9999-9999", new HashMap<>());
//		

//		HashMap<String, String> name_map = fam_map.get("����");

//		System.out.println(phone_book);
//		HashMap<String, HashMap<String, String>> friend_map = phone_book.get("ģ��");
//		
//		HashMap<String, String> name_map = fam_map.get("ģ��");
//		name_map.put("010-1234-5678", "�ƹ���");
//		name_map.put("010-4321-1234", "��Ӵ�");
//		name_map.put("010-8888-7777", "������");
