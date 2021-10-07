import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


import { HomeComponent } from './home/home.component';

import { RegisterUserComponent } from './register-user/register-user.component';
import { IssueInformationComponent } from './issue-information/issue-information.component';
import { ALLSTUDENTSComponent } from './all-students/all-students.component';
import { BooksComponent } from './books1/books.component';
import { CommentComponent } from './comment/comment.component';
import { AddBooksComponent } from './add-books/add-books.component';

import { PasswordComponent } from './password/password.component';

import { AddStudentsComponent } from './add-students/add-students.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { BookRequestComponent } from './book-request/book-request.component';
import { ApproveComponent } from './approve/approve.component';
import { ApprovedComponent } from './approved/approved.component';
import { ExpiredListComponent } from './expired-list/expired-list.component';
import { ReturnedComponent } from './returned/returned.component';
import { ExpiredComponent } from './expired/expired.component';
import { FooterComponent } from './footer/footer.component';




const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'books', component:BooksComponent},
  
  {path: 'footer', component:FooterComponent},
  
  {path: 'register-user', component: RegisterUserComponent},
  {path: 'issue-information', component: IssueInformationComponent},
  {path: 'all-students', component: ALLSTUDENTSComponent},
  {path: 'comment', component: CommentComponent},
  {path: 'add-books', component: AddBooksComponent},

  {path: 'password', component:PasswordComponent},
  {path: 'sidenav', component:SidenavComponent},
  {path: 'add-students', component:AddStudentsComponent},
  {path: 'book-request', component:BookRequestComponent},
  {path: 'approve', component:ApproveComponent},
  {path: 'approved', component:ApprovedComponent},
  {path: 'expired-list', component:ExpiredListComponent},
  {path: 'returned', component:ReturnedComponent},
  {path: 'expired', component:ExpiredComponent},
  {path: 'issue-information', component:IssueInformationComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
