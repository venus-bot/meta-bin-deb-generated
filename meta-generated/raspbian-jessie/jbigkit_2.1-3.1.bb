PACKAGES = "${PN} libjbig0"
PROVIDES = "libjbig0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/j/jbigkit/libjbig0_2.1-3.1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libjbig0 = "libjbig0_2.1-3.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "5c96e3caef8bda970fb069770209422e110fb65f701a5b207f37ec122c202b2a"
SRC_URI[deb0.md5sum] = "fd3b070338787593a35463230f0b486b"

RDEPENDS_libjbig0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libjbig0 = " \
    ./usr/lib/arm-linux-gnueabihf/libjbig.so.0 \
    ./usr/share/doc/libjbig0/changelog.Debian.gz \
    ./usr/share/doc/libjbig0/changelog.gz \
    ./usr/share/doc/libjbig0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
