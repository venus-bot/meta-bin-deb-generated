PACKAGES = "${PN} initscripts sysv-rc sysvinit-utils"
PROVIDES = "initscripts sysv-rc sysvinit-utils"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sysvinit/initscripts_2.88dsf-59_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/s/sysvinit/sysv-rc_2.88dsf-59_all.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/s/sysvinit/sysvinit-utils_2.88dsf-59_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_initscripts = "initscripts_2.88dsf-59_armhf.deb"
SRC_URI[deb0.sha256sum] = "f1ac482f9ca30c59b49f6448cd2efdbf720a416ee3ff1e0afcdae4ae04edc0b7"
SRC_URI[deb0.md5sum] = "cf038b431c690c98b82b0ebed37fef84"
DEBFILENAME_sysv-rc = "sysv-rc_2.88dsf-59_all.deb"
SRC_URI[deb1.sha256sum] = "da964cb1d9016ebbb65667b1ec743bbec06d817278d4038e15292ce554f835da"
SRC_URI[deb1.md5sum] = "0ed4ac245bbb6e0dbde36613151bc393"
DEBFILENAME_sysvinit-utils = "sysvinit-utils_2.88dsf-59_armhf.deb"
SRC_URI[deb2.sha256sum] = "ed4ed4a63f75f19f9085c669f03b541560fda3e2096f8bf7fa43cdf6dcf52ab9"
SRC_URI[deb2.md5sum] = "357131184439e7d7349cd9230655c3b0"

RDEPENDS_initscripts = "libc6 (>= 2.4) debianutils (>= 4) lsb-base (>= 3.2-14) sysvinit-utils (>= 2.88dsf-50) sysv-rc coreutils (>= 5.93)"
RDEPENDS_sysv-rc = "debconf (>= 0.5) sysvinit-utils (>= 2.86.ds1-62) insserv (>> 1.12.0-10) startpar"
RDEPENDS_${PN}-utils = "libc6 (>= 2.7) libselinux1 (>= 1.32) startpar"
DEPENDS = "debianutils coreutils debconf insserv lsb-base startpar libc6 libselinux1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_initscripts = " \
    ./etc/init.d/checkroot-bootclean.sh \
    ./usr/share/lintian/overrides/initscripts \
    ./etc/init.d/umountfs \
    ./etc/init.d/mountkernfs.sh \
    ./sbin/fsck.nfs \
    ./lib/init/bootclean.sh \
    ./etc/init.d/checkroot.sh \
    ./etc/init.d/rc.local \
    ./etc/init.d/mountnfs-bootclean.sh \
    ./usr/share/man/man5/halt.5.gz \
    ./usr/share/man/man1/mountpoint.1.gz \
    ./usr/share/doc/initscripts/NEWS.Debian.gz \
    ./etc/init.d/sendsigs \
    ./etc/init.d/umountroot \
    ./etc/init.d/motd \
    ./etc/init.d/skeleton \
    ./etc/init.d/checkfs.sh \
    ./usr/share/doc/initscripts/copyright \
    ./etc/init.d/halt \
    ./lib/init/swap-functions.sh \
    ./lib/init/tmpfs.sh \
    ./lib/init/mount-functions.sh \
    ./usr/share/doc/initscripts/changelog.gz \
    ./etc/init.d/killprocs \
    ./etc/init.d/bootmisc.sh \
    ./etc/init.d/mountall.sh \
    ./bin/mountpoint \
    ./etc/init.d/single \
    ./etc/init.d/mountall-bootclean.sh \
    ./etc/init.d/urandom \
    ./etc/init.d/hostname.sh \
    ./etc/init.d/rmnologin \
    ./etc/default/devpts \
    ./etc/init.d/mountnfs.sh \
    ./etc/init.d/reboot \
    ./etc/init.d/bootlogs \
    ./etc/default/rcS \
    ./etc/default/tmpfs \
    ./etc/init.d/umountnfs.sh \
    ./usr/share/man/man8/fsck.nfs.8.gz \
    ./etc/default/halt \
    ./etc/network/if-up.d/mountnfs \
    ./usr/share/doc/initscripts/changelog.Debian.gz \
    ./usr/share/man/man5/rcS.5.gz \
    ./usr/share/man/man5/tmpfs.5.gz \
    ./usr/share/doc/initscripts/README.Debian \
    ./etc/init.d/mountdevsubfs.sh \
    ./lib/init/vars.sh\
"
FILES_sysv-rc = " \
    ./usr/share/doc/sysv-rc/NEWS.Debian.gz \
    ./etc/init.d/README \
    ./usr/share/doc/sysv-rc/copyright \
    ./usr/share/man/man8/invoke-rc.d.8.gz \
    ./etc/rcS.d/README \
    ./etc/rc6.d/README \
    ./etc/rc1.d/README \
    ./etc/init.d/rc \
    ./etc/rc0.d/README \
    ./usr/share/doc/sysv-rc/README.policy-rc.d.gz \
    ./etc/rc3.d/README \
    ./usr/sbin/update-rc.d \
    ./etc/rc4.d/README \
    ./usr/share/doc/sysv-rc/README.invoke-rc.d.gz \
    ./usr/share/doc/sysv-rc/README.Debian \
    ./usr/share/lintian/overrides/sysv-rc \
    ./usr/share/man/man8/update-rc.d.8.gz \
    ./etc/rc2.d/README \
    ./usr/share/doc/sysv-rc/changelog.Debian.gz \
    ./usr/share/doc/sysv-rc/changelog.gz \
    ./etc/rc5.d/README \
    ./usr/share/sysv-rc/saveconfig \
    ./etc/init.d/rcS \
    ./usr/sbin/invoke-rc.d \
    ./usr/share/doc/sysv-rc/README.runlevels.gz\
"
FILES_sysvinit-utils = " \
    ./usr/share/man/man8/pidof.8.gz \
    ./usr/bin/last \
    ./usr/bin/mesg \
    ./usr/share/man/man1/lastb.1.gz \
    ./usr/share/man/man8/fstab-decode.8.gz \
    ./usr/share/man/man8/sulogin.8.gz \
    ./usr/share/doc/sysvinit-utils/changelog.Debian.gz \
    ./sbin/killall5 \
    ./usr/share/man/man1/mesg.1.gz \
    ./usr/bin/lastb \
    ./bin/pidof \
    ./usr/share/man/man5/init-d-script.5.gz \
    ./sbin/sulogin \
    ./lib/init/init-d-script \
    ./usr/share/doc/sysvinit-utils/changelog.gz \
    ./usr/share/doc/sysvinit-utils/NEWS.Debian.gz \
    ./usr/share/doc/sysvinit-utils/copyright \
    ./usr/share/man/man8/killall5.8.gz \
    ./sbin/fstab-decode \
    ./usr/sbin/service \
    ./usr/share/man/man1/last.1.gz \
    ./usr/share/man/man8/service.8.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
