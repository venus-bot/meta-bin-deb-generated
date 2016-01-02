PACKAGES = "sensible-utils"
PROVIDES = "sensible-utils"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/sensible-utils/sensible-utils_0.0.9_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_sensible-utils = "sensible-utils_0.0.9_all.deb"
SRC_URI[deb0.sha256sum] = "c848f80734e61379b5baac315c2342b2fea18d246074e6f5510fc643f5024978"
SRC_URI[deb0.md5sum] = "1b8ddff8ac3690dfce889b580779dc1b"


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
	./usr/bin/select-editor \
	./usr/share/doc/sensible-utils/copyright \
	./usr/share/man/de/man1/sensible-browser.1.gz \
	./usr/share/man/pl/man1/sensible-pager.1.gz \
	./usr/share/man/it/man1/sensible-editor.1.gz \
	./usr/bin/sensible-editor \
	./usr/share/man/ja/man1/sensible-pager.1.gz \
	./usr/share/man/es/man1/sensible-browser.1.gz \
	./usr/share/man/man1/sensible-editor.1.gz \
	./usr/bin/sensible-pager \
	./usr/share/man/man1/select-editor.1.gz \
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
