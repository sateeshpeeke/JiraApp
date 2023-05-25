<h1 style="text-align: center; color: red">Create Jira Task</h1>
<form action="createStory" method="post">
	<table align="center">
		<tr>
			<td>StoryId:</td>
			<td><input type="number" name="storyId"></td>
		</tr>
		<tr>
			<td>Summary:</td>
			<td><input type="text" name="summary"></td>
		</tr>
		<tr>
			<td>Assign To:</td>
			<td><input type="text" name="assignedTo"></td>
		</tr>
		<tr>
			<td>Story Points:</td>
			<td><input type="number" name="storyPoints"></td>
		</tr>
		<tr>
			<td>Sprint Number:</td>
			<td><input type="number" name="sprintNumber"></td>
		</tr>
		<tr>
			<td>Label:</td>
			<td><input type="text" name="label"></td>
		</tr>
		<tr>
			<td>Discription:</td>
			<td><input type="text" name="discription"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="submit"></td>
		</tr>
	</table>

</form>