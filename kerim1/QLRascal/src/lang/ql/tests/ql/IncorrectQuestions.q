form IncorrectQuestions {
	requiresBool: "This one requires bool" bool
	requiresBool: "And so should this one" int
	
	requiresInt: "This one requires int" int(+2)
	requiresInt: "And so should this one require int" bool(true)
	
	nonComputed: "A non-computed question" int
	nonComputed: "So, not computed" int(1 + 2)
	
	computed: "A computed question" bool(9 > 8)
	computed: "So, not non-computed" bool
	
	duplicateLabel: "This one requires bool" string
}