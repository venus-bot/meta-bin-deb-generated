PACKAGES = "insserv"
PROVIDES = "insserv"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/i/insserv/insserv_1.14.0-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_insserv = "insserv_1.14.0-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "48bf3e0fdca8c9df5a9dba6bdcddda3fc599c76da1d1999d044a564aeecd0dfd"
SRC_URI[deb0.md5sum] = "1f8468bc7975cb6e76615f04cc2ad19a"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/insserv/check-archive-initd-scripts \
	./usr/share/doc/insserv/changelog.gz \
	./etc/insserv.conf \
	./usr/share/insserv/seq-changes \
	./usr/share/insserv/make-testsuite \
	./sbin/insserv \
	./usr/share/doc/insserv/changelog.Debian.gz \
	./usr/share/doc/insserv/README \
	./usr/share/doc/insserv/copyright \
	./usr/share/doc/insserv/README.Debian \
	./usr/share/insserv/check-initd-order \
	./usr/share/man/man8/insserv.8.gz \
	./etc/bash_completion.d/insserv\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
