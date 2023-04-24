package sample02;

public class MemberService {
	private MemberDAO memberDAO;
	private Member member;
	
	public MemberService() {}

	public MemberService(MemberDAO memberDAO, Member member) {
		super();
		this.memberDAO = memberDAO;
		this.member = member;
		System.out.println("MemberService(MemberDAO memberDAO, Member member) call");
	}
	
	
	public void serviceInsert() {
		System.out.println("serviceInsert call");
		memberDAO.insert(member);
	}
}
