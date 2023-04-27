## What does this MR do and why?

_Describe in detail what your merge request does and why._

<!--
Please keep this description updated with any discussion that takes place so
that reviewers can understand your intent. Keeping the description updated is
especially important if they didn't participate in the discussion.
-->

## MR acceptance checklist

<!--
⚠️ When fixing non-trivial issues, please leave the thread unresolved, so it can be resolved by the original commenter (
Owner). This helps ensure that the change is validated by the person who initiated the discussion and prevents
misunderstandings or miscommunications.
-->

- [ ] I have **rebased** this branch on top of the destination branch (usually `master`)
- [ ] I have executed locally `./gradlew spotlessApply check` *before creating the MR* and it has run successfully
- [ ] My contribution is fully baked and ready to be merged as is
- [ ] I have performed a self-review of my own code
- [ ] There are no `WIP` commits in this PR
- [ ] I ensure that all the open issues my contribution closes are mentioned in the commit message using
  the `Closes #1234` [syntax](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)

<!-- template sourced from https://gitlab.com/gtk-kn/gtk-kn/-/blob/master/.gitlab/merge_request_templates/Default.md -->

/assign me
/assign_reviewer @leinardi @vbsteven @petuska
