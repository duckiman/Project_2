import { Component, OnInit } from '@angular/core';
import {ProductService} from "../../services/product.service";
import {Route, Router} from "@angular/router";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  products:any[]=[];

  constructor(private productService: ProductService,
              private router: Router) { }

  ngOnInit(): void {
    this.productService.getAllProducts().subscribe(
      response => {
        this.products= response;
      }
    );
  }

  selectProduct(id: Number) {
    this.router.navigate(['/product', id]).then();
  }
}
