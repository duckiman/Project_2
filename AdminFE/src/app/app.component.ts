import {Component, OnInit} from '@angular/core';
//import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'AdminFE';

  ngOnInit(): void {
//    this.onLoad();
  }
  constructor() {}
  // onLoad(){
  // this.http.get<any>('http://localhost:8070/api/sp1/product/list').subscribe(
  //   response => {
  //     console.log(response);
  //     }
  //   );
  // }
}
