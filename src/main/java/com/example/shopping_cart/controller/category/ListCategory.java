package com.example.shopping_cart.controller.category;

import javax.servlet.http.HttpServlet;

public class ListCategory extends HttpServlet {
    private CreateCategory categoryModel;
    public ListCategory() {
        this.categoryModel = new MySqlCategoryModel();
}
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("categories", categoryModel.findAll());
        req.getRequestDispatcher("list.jsp").forward(req, resp);
    }
}
