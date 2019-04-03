package chart;
import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class ChartUtil {
	/**
	 * 创建数据集合
	 * 
	 * @return CategoryDataset对象
	 */
	public static CategoryDataset createDataSet() {
		// 实例化DefaultCategoryDataset对象
		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
		// 向数据集合中添加数据
		dataSet.addValue(500, "图书销量", "文学");
		dataSet.addValue(100, "图书销量", "医药");
		dataSet.addValue(400, "图书销量", "儿童");
		dataSet.addValue(900, "图书销量", "机械");
		dataSet.addValue(200, "图书销量", "其他");

		return dataSet;
	}

	/**
	 *创建JFreeChart对象
	 * 
	 * @return JFreeChart对象
	 */
	public static JFreeChart createChart() {
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN"); // 创建主题样式
		standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20)); // 设置标题字体
		standardChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15)); // 设置图例的字体
		standardChartTheme.setLargeFont(new Font("宋体", Font.PLAIN, 15)); // 设置轴向的字体
		ChartFactory.setChartTheme(standardChartTheme); // 设置主题样式
		// 通过ChartFactory创建JFreeChart
		JFreeChart chart = ChartFactory.createBarChart3D("一周图书销量统计", // 图表标题
				"图书分类", // 横轴标题
				"销量（本）", // 纵轴标题
				createDataSet(), // 数据集合
				PlotOrientation.VERTICAL, // 图表方向
				false, // 是否显示图例标识
				false, // 是否显示tooltips
				false); // 是否支持超链接
		return chart;
	}

}