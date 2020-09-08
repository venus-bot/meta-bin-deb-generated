PACKAGES = "${PN} sensible-utils"
PROVIDES = "sensible-utils"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sensible-utils/sensible-utils_0.0.12_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_sensible-utils = "sensible-utils_0.0.12_all.deb"
SRC_URI[deb0.sha256sum] = "2043859f8bf39a20d075bf52206549f90dcabd66665bb9d6837273494fc6a598"
SRC_URI[deb0.md5sum] = "2acd29394e647546a1c07294fb4060ca"

RDEPENDS_${PN} = ""

inherit deb_group

FILES_${PN} = " \
    ./usr/bin/select-editor \
    ./usr/bin/sensible-browser \
    ./usr/bin/sensible-editor \
    ./usr/bin/sensible-pager \
    ./usr/lib/mime/packages/sensible-utils \
    ./usr/share/doc/sensible-utils/changelog.gz \
    ./usr/share/doc/sensible-utils/copyright \
    ./usr/share/man/cs/man1/sensible-editor.1.gz \
    ./usr/share/man/de/man1/sensible-editor.1.gz \
    ./usr/share/man/es/man1/sensible-editor.1.gz \
    ./usr/share/man/fr/man1/sensible-editor.1.gz \
    ./usr/share/man/it/man1/sensible-editor.1.gz \
    ./usr/share/man/ja/man1/sensible-editor.1.gz \
    ./usr/share/man/man1/select-editor.1.gz \
    ./usr/share/man/man1/sensible-browser.1.gz \
    ./usr/share/man/man1/sensible-editor.1.gz \
    ./usr/share/man/man1/sensible-pager.1.gz \
    ./usr/share/man/pl/man1/sensible-editor.1.gz \
    ./usr/share/man/pt/man1/sensible-editor.1.gz \
    ./usr/share/sensible-utils/bin/gettext\
"
