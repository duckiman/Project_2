import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {Observable} from "rxjs";
import {ProductModelServer, ServerResponse} from "../models/product.model";
//import * as http from "http";


@Injectable({
  providedIn: 'root'
})
export class ProductService {
  SERVER_URL = environment.SERVER_URL;
  constructor(private http: HttpClient) {

  }
  getAllProducts(limitOfResults=6): Observable<ServerResponse> {
    return this.http.get<ServerResponse>(this.SERVER_URL + 'products', {
      params: {
        limit: limitOfResults.toString()
      }
    });
  }
  getSingleProduct(id: Number): Observable<ProductModelServer> {
    return this.http.get<ProductModelServer>(this.SERVER_URL + 'products/' + id);
  }
  getProductsFromCategory(catName: String): Observable<ProductModelServer[]> {
    return this.http.get<ProductModelServer[]>(this.SERVER_URL + 'products/category/' + catName);
  }
}
