package ai.jobiak.dao;



import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAO {

	//performs CRUD operation with the customer table, hence needs JdbcTemplate
	
	private JdbcTemplate mysqlTemplate;
	
	
	public JdbcTemplate getMysqlTemplate() {
		return mysqlTemplate;
	}


	public void setMysqlTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate = mysqlTemplate;
	}

	

	public int insertRow() {
			
		return mysqlTemplate.update("insert into customer values(0,'hema',5000)");
		}
}