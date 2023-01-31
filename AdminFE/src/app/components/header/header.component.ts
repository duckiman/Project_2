import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {

    // $('a.dropdown-toggle').on('click', function (e) {
    //   alert('aaa')
    // });
  //   let btn = document.getElementById('cart-btn');
  //   // @ts-ignore
  //   btn.addEventListener("click", function(e){
  //     let isExpanded = this.getAttribute("aria-expanded");
  //     // alert(isExpanded);
  //     if(isExpanded == 'true'){
  //       // @ts-ignore
  //       this.parentNode.classList.remove('open');
  //     }else{
  //       // @ts-ignore
  //       this.parentNode.classList.add('open');
  //     }
  //
  //     this.setAttribute("aria-expanded",  isExpanded == 'false'? 'true': 'false');
  //
  //   });
  //
  //
  //
  //   let cartDropdown = document.getElementsByClassName('cart-dropdown')[0];
  //   // @ts-ignore
  //   cartDropdown.addEventListener("click", function(e) {
  //     e.stopPropagation();
  //   })
   }

}
