

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="dist/css/bootstrap.min.css" rel="stylesheet"/>
    <title>Öğrenci Bilgileri</title>
</head>
<body>
<div class="container">
    <div class="navbar navbar-default">
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="#">AnaSayfa</a></li>
                <li><a href="#">Hakkımızda</a></li>    
                <li><a href="#">Hizmetlerimiz</a></li>
                <li class="active"><a href="#">Kayıt</a></li>
                <li><a href="#">Yetkili Girişi</a></li>
            </ul>
        </div>
    </div>

    <%
        String[] d = 
                {
                    "Bilgisayar Mühendisliği",
                    "Çevre Mühendisliği",
                    "Elektrik ve Elektronik Mühendisliği",
                    "Endüstri Mühendisliğ",
                    "Gıda Mühendisliği",
                    "Harita Mühendisliği",
                    "İnşaat Mühendisliği",
                    "Kimya Mühendiliği",
                    "Makina Mühendisliği",
                    "Malzame Bilimleri Mühendisliği"
                };

        int x = Integer.valueOf(request.getParameter("id"));

    %>
    <br/><br/>

    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-primary" >

                <div class="panel-heading" >Aktif Kayıt</div>
                <table class="table table-striped table-bordered table-hover">
                    <tr>
                        <td>Öğrenci No</td>
                        <td>${ogrenci.ogrenciNo}</td>
                    </tr>
                    <tr>
                        <td>Öğrenci Ad</td>
                        <td>${ogrenci.ogrenciAd}</td>
                    </tr>
                    <tr>
                        <td>Öğrenci Soyad</td>
                        <td>${ogrenci.ogrenciSoyad}</td>
                    </tr>
                    <tr>
                        <td>Bölümü</td>
                        <td> <%=d[x]%></td>
                    </tr>
                    <tr>
                        <td>Öğrenci Eposta</td>
                        <td>${ogrenci.ogrenciEposta}</td>
                    </tr>

                </table>
            </div>

        </div>

        <hr class="featurette-divider">

        <div id="footer">
            <div class="container">
                <p class="text-muted credit">Ufuk Palavar Tasarımıdır. &copy; 2015 Company,Tüm Hakları Saklıdır.  &nbsp;&nbsp;&nbsp; <a href="#" class="btn" style="color:  darkgrey; float: right">Hakkımda</a> &nbsp;&nbsp;&nbsp;<a class="btn" href="#" style="color:  darkgrey; float: right">Gizlilik</a></p>

            </div>
        </div>


    </div> 
</div>   
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="dist/js/bootstrap.min.js"></script>



</body>
</html>
