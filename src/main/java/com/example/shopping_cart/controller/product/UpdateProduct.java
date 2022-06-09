package com.example.shopping_cart.controller.product;

import javax.servlet.http.HttpServlet;

public class UpdateProduct extends HttpServlet {
    private ProductModel productModel;
    public UpdateProduct() {
        this.productModel = new MySqlProductModel();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product product = productModel.findById(Integer.parseInt(req.getParameter("id")));
        if(product == null) {
            product = new Product();
        }
        req.setAttribute("product", product);
        req.getRequestDispatcher("/products/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
}
