PACKAGES = "${PN} libtasn1-6"
PROVIDES = "libtasn1-6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libt/libtasn1-6/libtasn1-6_4.2-3+deb8u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtasn1-6 = "libtasn1-6_4.2-3+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "1046b5b201be909f1ffdcf99c3eff1978bc0462a3c332a61e75a28c0d8855e4b"
SRC_URI[deb0.md5sum] = "de75223ad8cf6b92c6d87f4a4854e559"

RDEPENDS_${PN} = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/doc/libtasn1-6/THANKS \
    ./usr/share/doc/libtasn1-6/AUTHORS \
    ./usr/share/doc/libtasn1-6/NEWS.gz \
    ./usr/lib/arm-linux-gnueabihf/libtasn1.so.6 \
    ./usr/share/doc/libtasn1-6/changelog.Debian.gz \
    ./usr/share/doc/libtasn1-6/copyright \
    ./usr/lib/arm-linux-gnueabihf/libtasn1.so.6.3.2 \
    ./usr/share/doc/libtasn1-6/README\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
