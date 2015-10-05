<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FranConnect Automation</title>

</head>

<body style="background-color:#E6E6FA">

<br><br>
<div align="center">
<b><u>FranConnect Automation Project</u></b>
<form id="userautomation" action="BrowserServlets" style="width: 500px" method="post" >
<fieldset>

<table style="width:100%" border="5" cellspacing="5">
	<tr>
		<td>
			<label>No. of Builds : </label>
		</td>
		<td>
			<select name="noOfBuilds">
				<option value="0">Select</option>
  				<option value="1">1</option>
  				<option value="2">2</option>
  				<option value="3">3</option>
  				<option value="4">4</option>
  				<option value="5">5</option>
			</select>
		</td>
		<tr>
		<td>
			<label>Build Url : </label>
		</td>
		<td>
			<input type="text" name=buildUrl>
		</td>
		
	</tr>
	<tr>
		<td><Label>Operating System : </Label></td>
		<td>
			<select name="operatingSystem">
  				<option value="0">Select</option>
  				<option value="windows7">Windows-7</option>
  				<option value="windows8">Windows-8</option>
  				<option value="Windows8.1">Windows-8.1</option>
  				<option value="mac">Mac</option>
  				<option value="Linux">Linux</option>
			</select>
		</td>
	</tr>
	<tr >
		<td><Label>Browser Name : </Label></td>
		<td>	
			<select name="browserName">
  				<option value="0">Select</option>
  				<option value="firefox">FireFox</option>
  				<option value="chrome">Chrome</option>
  				<option value="safari">Safari</option>
  				<option value="opera">Opera</option>
  				<option value="internetexplorer10">Internet Explorer-10</option>
  				<option value="internetexplorer11">Internet Explorer-11</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			<Label>IP Address : </Label>
		</td>
		<td>
			<input type="text" name="ipAddress">
		</td>
	</tr>
	<tr>
		<td></td>
		<td><button type="submit" name="Submit">Run</button></td>
	</tr>
</table>
</fieldset>

</form>
</div>
</body>
</html>