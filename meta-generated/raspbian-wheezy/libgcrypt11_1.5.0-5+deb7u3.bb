PACKAGES = "libgcrypt11"
PROVIDES = "libgcrypt11"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgcrypt11/libgcrypt11_1.5.0-5+deb7u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt11 = "libgcrypt11_1.5.0-5+deb7u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "17967f5f62e386b0812f5099519420c9760ea0e85b2f143b1ee41ba2e6450c0f"
SRC_URI[deb0.md5sum] = "846c590e22ef29b57d6a0d3411461fde"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libgpg-error0 (>= 1.10)"
DEPENDS = "libgpg-error0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libgcrypt11/changelog.Debian.gz \
	./usr/share/doc/libgcrypt11/TODO \
	./usr/share/doc/libgcrypt11/AUTHORS.gz \
	./usr/share/doc/libgcrypt11/changelog.gz \
	./lib/arm-linux-gnueabihf/libgcrypt.so.11 \
	./usr/share/doc/libgcrypt11/THANKS.gz \
	./usr/share/doc/libgcrypt11/NEWS.gz \
	./usr/share/doc/libgcrypt11/README.gz \
	./lib/arm-linux-gnueabihf/libgcrypt.so.11.7.0 \
	./usr/share/doc/libgcrypt11/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
