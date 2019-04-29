package Object;

import java.sql.*;


public class Pageable {

	private int pageSize;

	private int totalRows;

	private int totalPages;

	private static int currentPage;

	private int rowsCount;

	public Pageable(ResultSet rs) {
		try {
			rs.last();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			this.setTotalRows(rs.getRow());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			rs.beforeFirst();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}

	
	public void setPageSize(int pageSize) {
		if (pageSize >= 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = 1;
		}

		this.setTotalPages();
	}

	
	public void gotoPage(int page) {

		switch (page) {
		case -1:
			this.setCurrentPage(1);

			break;
		case -2:

			int t = this.getCurrentPage();

			this.setCurrentPage(t - 1);

			break;
		case -3:

			int n = this.getCurrentPage();
			this.setCurrentPage(n + 1);
			break;
		case -4:
			this.setCurrentPage(this.getTotalPages());
			break;
		default:
			this.setCurrentPage(page);

		}
	}

	
	public void setCurrentPage(int page) {

		if (page <= 0)
			this.currentPage = 1;
		if (page > this.getTotalPages())
			this.currentPage = this.getTotalPages();
		else
			this.currentPage = page;
		this.setRowsCount((this.currentPage - 1) * this.getPageSize() + 1);
		System.out.println(this.getRowsCount());
	}

	
	public int getCurrentPageRowsCount() {
		if (this.getPageSize() == 0)
			return this.getTotalRows();
		if (this.getTotalRows() == 0)
			return 0;
		if (this.getCurrentPage() != this.getTotalPages())
			return this.getPageSize();

		return this.getTotalRows() - (this.getTotalPages() - 1)
				* this.getPageSize();
	}

	
	public int getPageSize() {
		return this.pageSize;
	}

	public int getTotalRows() {
		return totalRows;
	}

	
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	
	public int getRowsCount() {
		return rowsCount;
	}

	
	public void setRowsCount(int rowsCount) {
		this.rowsCount = rowsCount;
	}

	
	public int getCurrentPage() {
		return currentPage;
	}

	
	public int getTotalPages() {
		return this.totalPages;
	}

	
	public void setTotalPages() {
		if (this.getTotalRows() == 0) {
			this.totalPages = 0;
		} else if (this.getPageSize() == 0) {
			this.totalPages = 1;
		} else {
			if (this.getTotalRows() % this.getPageSize() != 0)
				this.totalPages = this.getTotalRows() / this.getPageSize() + 1;
			else
				this.totalPages = this.getTotalRows() / this.getPageSize();
		}
	}

	
	public void pageFirst() throws java.sql.SQLException {
		this.setRowsCount((this.getCurrentPage() - 1) * this.getPageSize() + 1);
	}

	
	public void pageLast() throws java.sql.SQLException {
		this.setRowsCount((this.getCurrentPage() - 1) * this.getPageSize()
				+ this.getCurrentPageRowsCount());
	}
}
