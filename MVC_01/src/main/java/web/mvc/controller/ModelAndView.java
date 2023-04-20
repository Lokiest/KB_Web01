package web.mvc.controller;
/**
 *  컨트롤러를 실행한 후 어떤 뷰 페이지로 이동할 것인지,
 *  어떤 이동 방식으로 이동할 것인지를 결정 >> 속성을 관리하는 객체 (POJO방식)
 * */
public class ModelAndView {
   private String viewName; //이동할 뷰 이름
   private boolean isRedirect; //이동 방식 (true > redirect, false > forward)
   
   public ModelAndView() {}
   public ModelAndView(String viewName) {
	   this.viewName = viewName;
   }
  public ModelAndView(String viewName, boolean isRedirect) {
	this(viewName);
	this.isRedirect = isRedirect;
 }
  
  
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
  
  
   
}
