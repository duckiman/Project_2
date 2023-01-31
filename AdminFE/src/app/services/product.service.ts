import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
//import * as http from "http";


@Injectable({
  providedIn: 'root'
})
export class ProductService {
  SERVER_URL = environment.SERVER_URL;
  constructor(private http: HttpClient) { }

  getAllProducts(){
    return this.http.get<any>(this.SERVER_URL+'/sp1/product/list')
  }
}
