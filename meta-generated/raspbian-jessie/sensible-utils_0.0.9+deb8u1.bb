PACKAGES = "${PN} sensible-utils"
PROVIDES = "sensible-utils"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sensible-utils/sensible-utils_0.0.9+deb8u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_sensible-utils = "sensible-utils_0.0.9+deb8u1_all.deb"
SRC_URI[deb0.sha256sum] = "0de3d1447f16851862e57951a6779c5adc9a97d0438092b2761c0d989c64ae9c"
SRC_URI[deb0.md5sum] = "c538301ccd44538097ebe8ecf883534f"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/bin/select-editor \
    ./usr/bin/sensible-browser \
    ./usr/bin/sensible-editor \
    ./usr/bin/sensible-pager \
    ./usr/lib/mime/packages/sensible-utils \
    ./usr/share/doc/sensible-utils/changelog.gz \
    ./usr/share/doc/sensible-utils/copyright \
    ./usr/share/man/de/man1/sensible-browser.1.gz \
    ./usr/share/man/de/man1/sensible-editor.1.gz \
    ./usr/share/man/de/man1/sensible-pager.1.gz \
    ./usr/share/man/es/man1/sensible-browser.1.gz \
    ./usr/share/man/es/man1/sensible-editor.1.gz \
    ./usr/share/man/es/man1/sensible-pager.1.gz \
    ./usr/share/man/fr/man1/sensible-browser.1.gz \
    ./usr/share/man/fr/man1/sensible-editor.1.gz \
    ./usr/share/man/fr/man1/sensible-pager.1.gz \
    ./usr/share/man/it/man1/sensible-browser.1.gz \
    ./usr/share/man/it/man1/sensible-editor.1.gz \
    ./usr/share/man/it/man1/sensible-pager.1.gz \
    ./usr/share/man/ja/man1/sensible-browser.1.gz \
    ./usr/share/man/ja/man1/sensible-editor.1.gz \
    ./usr/share/man/ja/man1/sensible-pager.1.gz \
    ./usr/share/man/man1/select-editor.1.gz \
    ./usr/share/man/man1/sensible-browser.1.gz \
    ./usr/share/man/man1/sensible-editor.1.gz \
    ./usr/share/man/man1/sensible-pager.1.gz \
    ./usr/share/man/pl/man1/sensible-browser.1.gz \
    ./usr/share/man/pl/man1/sensible-editor.1.gz \
    ./usr/share/man/pl/man1/sensible-pager.1.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
