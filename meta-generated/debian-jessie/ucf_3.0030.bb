PACKAGES = "${PN} ucf"
PROVIDES = "ucf"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/u/ucf/ucf_3.0030_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_ucf = "ucf_3.0030_all.deb"
SRC_URI[deb0.sha256sum] = "1b93d9fc5930b9d8382705b71605e07fe11f4796db239b7ac2644bf4fbd7f6a2"
SRC_URI[deb0.md5sum] = "bbec42184e8bdce20002bcf37b38b89a"

RDEPENDS_${PN} = "debconf (>= 1.5.19) coreutils (>= 5.91)"
DEPENDS = "debconf coreutils"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/man/man1/lcf.1.gz \
    ./usr/share/doc/ucf/copyright \
    ./usr/share/doc/ucf/changelog.gz \
    ./usr/share/man/man1/ucf.1.gz \
    ./usr/share/man/man1/ucfq.1.gz \
    ./usr/bin/ucf \
    ./usr/share/doc/ucf/examples/postrm \
    ./usr/bin/lcf \
    ./usr/bin/ucfr \
    ./usr/share/lintian/overrides/ucf \
    ./usr/bin/ucfq \
    ./usr/share/doc/ucf/examples/postinst.gz \
    ./etc/ucf.conf \
    ./usr/share/man/man5/ucf.conf.5.gz \
    ./usr/share/man/man1/ucfr.1.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
