import { Component, OnInit } from '@angular/core';
import {ProductService} from "../../services/product.service";
import {Route, Router} from "@angular/router";
import {ProductModelServer, ServerResponse} from "../../models/product.model";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  products:ProductModelServer[] = [];

  constructor(private productService: ProductService,
              private router: Router) { }

  ngOnInit(): void {
    this.productService.getAllProducts(6).subscribe((prods: ServerResponse ) => {
      this.products = prods.products;
      }
    );
  }

  selectProduct(id: Number) {
    this.router.navigate(['/product', id]).then();
  }
}
