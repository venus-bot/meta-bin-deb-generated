PACKAGES = "${PN} lsb-base"
PROVIDES = "lsb-base"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/l/lsb/lsb-base_4.1+Debian13+nmu1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_lsb-base = "lsb-base_4.1+Debian13+nmu1_all.deb"
SRC_URI[deb0.sha256sum] = "1a200ffcc9d21838768f3acdc512e6ad6a8502bb70ecd3f597b660a56acaf739"
SRC_URI[deb0.md5sum] = "22c397322b6642eb00fec2fe0b1ef447"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_lsb-base = " \
    ./usr/share/doc/lsb-base/NEWS.Debian.gz \
    ./usr/share/doc/lsb-base/changelog.gz \
    ./usr/share/doc/lsb-base/README.Debian.gz \
    ./lib/lsb/init-functions \
    ./usr/share/doc/lsb-base/copyright \
    ./lib/lsb/init-functions.d/20-left-info-blocks\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
