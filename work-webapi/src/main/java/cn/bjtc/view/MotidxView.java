package cn.bjtc.view;

public class MotidxView  extends Pagination{

	private Integer id;
	private String idxname;
	private Integer tblid;
	private Integer colid;
	private Integer biztype;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdxname() {
		return idxname;
	}
	public void setIdxname(String idxname) {
		this.idxname = idxname;
	}
	public Integer getTblid() {
		return tblid;
	}
	public void setTblid(Integer tblid) {
		this.tblid = tblid;
	}
	public Integer getColid() {
		return colid;
	}
	public void setColid(Integer colid) {
		this.colid = colid;
	}
	public Integer getBiztype() {
		return biztype;
	}
	public void setBiztype(Integer biztype) {
		this.biztype = biztype;
	}
}
