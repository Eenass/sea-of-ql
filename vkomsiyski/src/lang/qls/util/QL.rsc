module lang::qls::util::QL

import lang::ql::ast::AST;
import lang::ql::util::Implode;
import util::Resources;

//scan the current project and find a corresponding QL file
public Form getForm(loc projectLoc, str name) {
	Resource resource = getProject(projectLoc);
	visit (resource) {
	case file(l): 
		if (l.file == "<name>.q")
			return load(l);
	}
	
	return form("", []);
}
