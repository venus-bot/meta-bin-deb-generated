PACKAGES = "libdb5.3"
PROVIDES = "libdb5.3"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/db5.3/libdb5.3_5.3.28-9_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdb5.3 = "libdb5.3_5.3.28-9_armhf.deb"
SRC_URI[deb0.sha256sum] = "51a1acea2487f1b1616f5b3c98f6acf13bd18444689c35f9b310f51018b1e596"
SRC_URI[deb0.md5sum] = "91b367b0200668f34fdaeb0c4fcdddc9"

RDEPENDS_lib${PN} = "libc6 (>= 2.17)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libdb5.3 = " \
	./usr/share/doc/libdb5.3/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libdb-5.3.so \
	./usr/share/doc/libdb5.3/copyright \
	./usr/share/lintian/overrides/libdb5.3 \
	./usr/share/doc/libdb5.3/build_signature_armhf.txt\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
