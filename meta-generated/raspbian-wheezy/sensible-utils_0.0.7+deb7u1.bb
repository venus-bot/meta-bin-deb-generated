PACKAGES = "sensible-utils"
PROVIDES = "sensible-utils"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sensible-utils/sensible-utils_0.0.7+deb7u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_sensible-utils = "sensible-utils_0.0.7+deb7u1_all.deb"
SRC_URI[deb0.sha256sum] = "15d464d7ed1ba109375969251d24028a1f6e80f20aff49810a180d1155c4fceb"
SRC_URI[deb0.md5sum] = "87b57cbc50641c0660958e9ffa9c789b"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/bin/sensible-browser \
	./usr/share/man/es/man1/sensible-editor.1.gz \
	./usr/share/doc/sensible-utils/changelog.gz \
	./usr/lib/mime/packages/sensible-utils \
	./usr/share/man/fr/man1/sensible-editor.1.gz \
	./usr/share/man/fr/man1/sensible-browser.1.gz \
	./usr/share/man/man1/sensible-browser.1.gz \
	./usr/share/man/es/man1/sensible-pager.1.gz \
	./usr/share/man/de/man1/sensible-editor.1.gz \
	./usr/share/man/pl/man1/sensible-editor.1.gz \
	./usr/share/man/de/man1/sensible-pager.1.gz \
	./usr/share/doc/sensible-utils/copyright \
	./usr/share/man/de/man1/sensible-browser.1.gz \
	./usr/share/man/pl/man1/sensible-pager.1.gz \
	./usr/share/man/it/man1/sensible-editor.1.gz \
	./usr/bin/sensible-editor \
	./usr/share/man/ja/man1/sensible-pager.1.gz \
	./usr/share/man/es/man1/sensible-browser.1.gz \
	./usr/share/man/man1/sensible-editor.1.gz \
	./usr/bin/sensible-pager \
	./usr/share/man/it/man1/sensible-pager.1.gz \
	./usr/share/man/it/man1/sensible-browser.1.gz \
	./usr/share/man/ja/man1/sensible-browser.1.gz \
	./usr/share/man/man1/sensible-pager.1.gz \
	./usr/share/man/pl/man1/sensible-browser.1.gz \
	./usr/share/man/ja/man1/sensible-editor.1.gz \
	./usr/share/man/fr/man1/sensible-pager.1.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
